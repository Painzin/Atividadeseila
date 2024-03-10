class BlocoTrimestral 
{
    public static void main(String[] args) 
    {
        //declara os gastos
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        //armazena os gastos total numa variavel
        int gastosTrimestre = gastosFevereiro + gastosJaneiro + gastosMarco;

        //printa os gastos total
        System.out.println(gastosTrimestre);

        //calcula a media dos gastos e armazena ela em uma variavel
        int mediaMensal = gastosTrimestre/3;

        //printa a media dos gastos
        System.out.println("Valor da média mensal: " + mediaMensal);
    }
}