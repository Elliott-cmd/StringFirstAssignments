public class Part1 {
    String findSimpleGene(String dna){
        dna = dna.toUpperCase();
        int sCoden = dna.indexOf("ATG");
        int eCoden = dna.indexOf("TAA", sCoden);
        if(sCoden != -1){
            if(eCoden != -1){
                if((sCoden-eCoden) % 3 == 0){
                    return dna.substring(sCoden, eCoden+3);
                }
            }
        }
        return "";
    }
    void testSimpleGene(){
        System.out.println(findSimpleGene("AAATGCCCTAACTAGATTAAGAAACC"));
    }
    public static void main(String[] args){
        Part1 p1 = new Part1();
        p1.testSimpleGene();
    }
}
