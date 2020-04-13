package br.com.newfeature.java13.newSwitch;

public class Main {

    private enum DIA_SEMANA {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO;
    }

    public static void main(String[] args) {

        // switch tradicional muito verboso..
        System.out.println(switchTradiconal(DIA_SEMANA.DOMINGO));

        // novo switch com yield verboso..
        System.out.println(novoSwitchcomYield(DIA_SEMANA.QUARTA));

        // novo switch menos verboso..
        System.out.println(novoSwitch(DIA_SEMANA.QUARTA));

        // novo switch diminuindo mais ainda o codigo..
        System.out.println(novoSwitch2(DIA_SEMANA.QUINTA));

    }

    private static String switchTradiconal(DIA_SEMANA dia){
        String resultado = "";
        switch (dia){
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                resultado = "Dia Útil";
                break;
            case SABADO:
            case DOMINGO:
                resultado = "Final de Semana";
                break;
            default:
                resultado = "Dia Inválido!!";
        }
        return resultado;
    }

    private static String novoSwitchcomYield(DIA_SEMANA dia){
        String resultado = switch (dia){
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                yield "Dia Útil";
            case SABADO:
            case DOMINGO:
                yield "Final de Semana";
            default:
                yield "Dia Inválido!!";
        };
        return resultado;
    }

    private static String novoSwitch(DIA_SEMANA dia){
        String resultado = "";
        switch (dia){
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> resultado = "Dia Útil";
            case SABADO, DOMINGO -> resultado = "Final de Semana";
            default -> resultado = "Dia Inválido!!";
        }
        return resultado;
    }

    private static String novoSwitch2(DIA_SEMANA dia){
        return switch (dia){
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia Útil";
            case SABADO, DOMINGO -> "Final de Semana";
            default -> "Dia Inválido!!";
        };
    }
}
