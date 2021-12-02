package org.vut.feec.project.services;

import org.vut.feec.project.data.PersonRepository;

public class AuthService {
    private PersonRepository personRepository;

    public AuthService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
