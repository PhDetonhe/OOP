public class Cadeira {
        String tipo;
        String cor;
        String material;
        char descansoDeBraco;

        public String getTipo(){
            return tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }

        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getMaterial() {
                return material;
        }
        public void setMaterial(String material) {
                this.material= material;
        }

        public char getDescansoDeBraco() {
        return descansoDeBraco;
        }
        public void setDescansoDeBraco(char descansoDeBraco) {
        this.descansoDeBraco = descansoDeBraco;
        }

}

import java.util.Scanner;
public class objCadeira {
    public static void main(String[] args) {
        Cadeira objCadeira = new Cadeira();
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com a quantidade de cadeiras");
        int n = ler.nextInt();
        ler.nextLine();

        for(int i = 0; i < n; i++){
        System.out.println("Insira o tipo da cadeira:");
        String tipo = ler.nextLine();
        System.out.println("Insira a cor da cadeira:");
        String cor = ler.nextLine();
        System.out.println("A cadeira possui descanso para braços?:");
        char descansoDeBraco = ler.next().charAt(0);
        ler.nextLine();
        System.out.println("Insira o material da cadeira:");
        String material = ler.nextLine();

            objCadeira.setTipo(tipo);
            objCadeira.setCor(cor);
            objCadeira.setDescansoDeBraco(descansoDeBraco);
            objCadeira.setMaterial( material);

        System.out.println("----------CADEIRA--------------");
        System.out.println("tipo: "+ objCadeira.getTipo());
        System.out.println("cor: "+objCadeira.getCor());
        System.out.println("possui descanso de braço?: "+ objCadeira.getDescansoDeBraco());
        System.out.println("material: "+objCadeira.getMaterial());
        System.out.println("----------------------------");
        }

    }
}

