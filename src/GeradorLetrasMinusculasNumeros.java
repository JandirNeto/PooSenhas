class GeradorLetrasMinusculasNumeros extends BaseGeradorSenha implements GeradorSenha {
    @Override
    public String gerarSenha(int tamanho) {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        return gerar(tamanho, new String[]{letrasMinusculas, numeros}, letrasMinusculas + numeros); // Garante uma letra minúscula e um número
    }
}
