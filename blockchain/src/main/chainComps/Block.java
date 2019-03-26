package main.chainComps;
import java.util.Date;
import main.newUtils.StringUtil;

public class Block{

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }
    
    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256( 
                previousHash +
                Long.toString(timeStamp) +
                Integer.toString(nonce) +
                data 
                );
        return calculatedhash;
    }

    public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
            // System.out.println("Mining Block");
            // System.out.println("Tried " + nonce + " hashes...");
            // System.out.println("Previous Hash : " + hash);
            // System.out.println("Previous Target : " + hash.substring( 0, difficulty));
			nonce ++;
            hash = calculateHash();
            // System.out.println("Current Hash : " + hash);
            // System.out.println("Current Target : " + hash.substring( 0, difficulty));
            // clearScreen();
		}
		System.out.println("Block Mined!!! : " + hash);
	}

    public String blockInfo(){
        return "Block Info:============================================ \nprevious hash: : " + previousHash + "\ntimeStamp : " + timeStamp + "\ndata : " + data + "\nhash : " + hash + "\n";
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}