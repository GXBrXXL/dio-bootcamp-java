
public class ExemploSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;
        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
        }
        System.out.println("O dia da semana é " + nomeDoDia);

    }
}

switch(expressao){case valor1:
// bloco de código a ser executado se a expressão for igual a valor1
break;case valor2:
// bloco de código a ser executado se a expressão for igual a valor2
break;
// outros casos...
default:
// bloco de código a ser executado se a expressão não corresponder a nenhum dos
// valores
}
