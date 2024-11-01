
class GeradorCompleto extends BaseGeradorSenha implements GeradorSenha {
    @Override
    public String gerarSenha(int tamanho) {
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "$&#@_";
        return gerar(tamanho, new String[]{letrasMaiusculas, letrasMinusculas, numeros, simbolos}, letrasMaiusculas + letrasMinusculas + numeros + simbolos); // Garante uma maiúscula, minúscula, número e símbolo
    }
}