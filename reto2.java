import java.util.Scanner;

public class reto2 {

    public String Nombre;
    public String id_cuerpo_agua;
    public String Municipio;
    public double IRCA;
    public String nivel;
    public String tamao;
    public double menor=10000;
    public String nom="";
    public String id="";

    public reto2(String Nombre, String id_cuerpo_agua, String Municipio, double IRCA, String nivel) {
        this.Nombre = Nombre;
        this.id_cuerpo_agua = id_cuerpo_agua;
        this.Municipio = Municipio;
        this.IRCA = IRCA;
        this.nivel = nivel;
    }

    public static void main(String[] args) {
        reto2 objeto = new reto2();
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamano: ");
        objeto.setTamao(leer.nextLine());
        reto2 vector[] = new reto2[Integer.parseInt(objeto.getTamao())];
        CuerpoDeAgua a = new CuerpoDeAgua();

        for (int i = 0; i < Integer.parseInt(objeto.getTamao()); i++) {

            String valores = leer.nextLine();
            String[] parts = valores.split(" ");
            String Nombre = parts[0]; // nombre
            String id_cuerpo_agua = (parts[1]); // numero
            String Municipio = parts[2]; // municipio
            double IRCA = Double.parseDouble(parts[3]);//irca
            String nivel = a.nivel(IRCA);//nivel    
            vector[i] = new reto2(Nombre, id_cuerpo_agua, Municipio, IRCA, nivel);

        }
        for (int i = 0; i < Integer.parseInt(objeto.getTamao()); i++) {
            System.out.println(vector[i].nivel);
            if(vector[i].IRCA<objeto.menor){
                objeto.menor=vector[i].IRCA;
                objeto.nom=vector[i].Nombre;
                objeto.id=vector[i].id_cuerpo_agua;
                
            }

        }

        System.out.println(a.contador);
        if (a.canmedio>0) {

            for (int i = 0; i < Integer.parseInt(objeto.getTamao()); i++) {
                if (vector[i].nivel == "MEDIO") {
                    System.out.print(vector[i].Nombre + " ");
                }
            }
        }
        else{
            System.out.println("NA");
        }
        System.out.println("\n"+objeto.nom+" "+objeto.id);
    }
    
    private reto2() {

    }

    public String getTamao() {
        return tamao;
    }

    public void setTamao(String tamao) {
        this.tamao = tamao;
    }
}
