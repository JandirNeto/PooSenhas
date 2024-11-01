import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

abstract class BaseGeradorSenha {
    protected Random random = new Random();

    protected String gerar(int tamanho, String[] obrigatorios, String adicionais) {
        List<Character> senha = new ArrayList<>();

        // Adiciona um caractere aleatório obrigatório de cada tipo
        for (String grupo : obrigatorios) {
            senha.add(grupo.charAt(random.nextInt(grupo.length())));
        }

        // Preenche o restante da senha com caracteres aleatórios do conjunto adicional
        for (int i = senha.size(); i < tamanho; i++) {
            senha.add(adicionais.charAt(random.nextInt(adicionais.length())));
        }

        // Embaralha para garantir uma senha aleatória
        Collections.shuffle(senha);

        // Converte a lista de caracteres para String
        StringBuilder resultado = new StringBuilder();
        for (char c : senha) {
            resultado.append(c);
        }
        return resultado.toString();
    }
}