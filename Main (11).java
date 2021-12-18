public class Questa3 {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o caminho do arquivo que vai ser criado:");
        file arquivo = new file(scan.nextLine()); 
        
        try {
            arquivo.creatrNewFile();
            
        } 
        catch (IOException e) {
            System.out.println("Caminho inválido");
        }
        scan.close();
    }
}
