class GeradorLetrasMinusculas extends BaseGeradorSenha implements GeradorSenha {
    @Override
    public String gerarSenha(int tamanho) {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        return gerar(tamanho, new String[]{letrasMinusculas}, letrasMinusculas); // Garante pelo menos uma letra minúscula
    }
}