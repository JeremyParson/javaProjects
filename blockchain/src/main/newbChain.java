package main;
import main.chainComps.*;
import java.util.ArrayList;

public class newbChain{

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
	public static int difficulty = 1;

    public static void main(String[] args) {
        blockchain.add(new Block("I am a block", "0"));
        System.out.println("Trying to mine block 0");
        blockchain.get(0).mineBlock(difficulty);

        int i = 1;
        while(true){
            blockchain.add(new Block("I am a block", blockchain.get(blockchain.size()-1).hash));
            System.out.println("Trying to mine block " + i);
            blockchain.get(i).mineBlock(difficulty);
            i++;

            if(i % 20 == 0){
				System.out.println("Chain Validation : " + isChainValid());
				difficulty++;
            }
        }
    }

    public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
}