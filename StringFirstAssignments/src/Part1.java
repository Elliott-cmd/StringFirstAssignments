public class Part1 {
    String findSimpleGene(String dna){
        dna = dna.toUpperCase();
        int sCoden = dna.indexOf("ATG");
        int eCoden = dna.indexOf("TAA", sCoden);
        if(sCoden != -1){
            
        }else{
            return "";
        }
    }
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
