
public class Estudos {
    public static void main(String[] args) {

        double celsius = 30.4;
        double Fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit: " + Fahrenheit);

        int temperatura;
        temperatura = (int) Fahrenheit;
            System.out.println("A temperatura de " + celsius + " graus Celsius em Fahrenheit é de " + temperatura) ;


                double temperaturaEmCelsius = 30.4;
                double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

                String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

                System.out.println(mensagem);

                int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
                System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);



        }
    }




