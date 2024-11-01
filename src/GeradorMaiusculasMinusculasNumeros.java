class GeradorMaiusculasMinusculasNumeros extends BaseGeradorSenha implements GeradorSenha {
    @Override
    public String gerarSenha(int tamanho) {
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        return gerar(tamanho, new String[]{letrasMaiusculas, letrasMinusculas, numeros}, letrasMaiusculas + letrasMinusculas + numeros); // Garante uma maiúscula, minúscula e número
    }
}