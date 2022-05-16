public class Main {

    public static void main(String[] args){
        // Declaración de variables:
        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "OTOÑO";

        // Sentencia if:
        System.out.println("Sentencia if:");
        if(numeroIf > 0) {
            System.out.println("Es positivo.");
        }else if (numeroIf < 0){
            System.out.println("Es negativo.");
        }else if(numeroIf == 0) {
            System.out.println("Vale 0.");
        }

        // Bucle While:
        System.out.println("Bucle for:");
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Bucle Do While:
        System.out.println("Bucle Do-While:");
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);

        // Bucle For
        System.out.println("Bucle For:");
        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Sentencia Switch:
        System.out.println("Sentencia Switch: ");
        switch (estacion){
            case "VERANO":
                System.out.println("Es VERANO.");
                break;
            case "OTOÑO":
                System.out.println("Es OTOÑO.");
                break;
            case "INVIERNO":
                System.out.println("Es INVIERNO.");
                break;
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA.");
            default:
                System.out.println("No es ninguna estación.");
        }
    }
}
