package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        return apiService.getUsers();
        //utilisation de l'interface apiService pour retourner le getUsers
        // resolution partielle du test de getUsersWithSuccess() (@link UserRepositoryTest)
    }

    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
        //utilisation de l'interface apiService pour utiliser le generateRandomUser()
        // resolution partielle du test de generateRandomUserWithSuccess() (@link UserRepositoryTest)

    }

    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
        //utilisation de l'interface apiService pour effacer un utiisateur a l'aide de la methodde deleteUser()
        // resolution partielle du test de deleteUserWithSuccess()(@link UserRepositoryTest)
    }
}
