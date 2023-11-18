

package com.mycompany.login;


/** 
 * A classe LoginScreen representa uma tela de login que gerencia o acesso dos usuários.
 */
import java.util.HashMap; // Importa a classe HashMap do pacote java.util
import java.util.Map;     // Importa a interface Map do pacote java.util

public class LoginScreen {
    private Map<String, String> userDatabase; // Um HashMap para armazenar usuários e senhas

    /**
     * Construtor da classe. Inicializa o banco de dados de usuários com alguns valores iniciais.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Método para realizar o login do usuário.
     * @param username O nome de usuário inserido pelo usuário.
     * @param password A senha inserida pelo usuário.
     * @return Retorna true se o login for bem-sucedido, false caso contrário.
     */
    public boolean login(String username, String password) {   
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; // Login com sucesso
            }
        }
        return false; // Login fracassado
    }

    /**
     * Método para adicionar um novo usuário ao banco de dados.
     * @param username O nome de usuário do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
