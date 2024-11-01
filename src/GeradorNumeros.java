class GeradorNumeros extends BaseGeradorSenha implements GeradorSenha {
    @Override
    public String gerarSenha(int tamanho) {
        String numeros = "0123456789";
        return gerar(tamanho, new String[]{numeros}, numeros); // Garante pelo menos um número
    }
}
