public class ForwardChainingSBP {
    public static void main(String[] args) {
        boolean faktaA = true;
        boolean faktaE = true;
        boolean ruleB=false, ruleC = false, ruleF = false, ruleG = false, ruleH = false, ruleI = false, ruleJ = false, ruleK = false;

        System.out.println("------ FAKTA-FAKTA ------");
        System.out.println("fakta A bernilai " + faktaA);
        System.out.println("fakta E bernilai " + faktaE);
        System.out.println("------ GOAL ------");
        System.out.println("Menentukan apakah K bernilai benar?");
        System.out.println("------ RULE AWAL ------");
        System.out.println("rule C bernilai " + ruleC);
        System.out.println("rule F bernilai " + ruleF);
        System.out.println("rule G bernilai " + ruleG);
        System.out.println("rule H bernilai " + ruleH);
        System.out.println("rule I bernilai " + ruleI);
        System.out.println("rule J bernilai " + ruleJ);
        System.out.println("rule K bernilai " + ruleK);

        if(faktaA && ruleB){
            ruleC=true;
        } else{
            ruleC=false;
        }

        if (faktaA && faktaE){
            ruleF=true;
        } else{
            ruleF=false;
        }

        if(faktaA){
            ruleG=true;
        }else{
            ruleG=false;
        }

        if(ruleG && faktaE){
            ruleH=true;
        }else{
            ruleH=false;
        }

        if(ruleC && ruleH){
            ruleI=true;
        }else{
            ruleI=false;
        }

        if(ruleI && faktaA){
            ruleJ=true;
        }else{
            ruleJ=false;
        }

        if(ruleG){
            ruleJ=true;
        }else{
            ruleJ=false;
        }

        if(ruleJ){
            ruleK=true;
        }else{
            ruleK=false;
        }

        System.out.println("------ RULE AKHIR ------");
        System.out.println("rule C bernilai " + ruleC);
        System.out.println("rule F bernilai " + ruleF);
        System.out.println("rule G bernilai " + ruleG);
        System.out.println("rule H bernilai " + ruleH);
        System.out.println("rule I bernilai " + ruleI);
        System.out.println("rule J bernilai " + ruleJ);
        System.out.println("rule K bernilai " + ruleK);
        System.out.println("------ HASIL GOAL ------");
        System.out.println("Menentukan apakah K bernilai benar?");
        System.out.println("K bernilai: " + ruleK);
    }
}
