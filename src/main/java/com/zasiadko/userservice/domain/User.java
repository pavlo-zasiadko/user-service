package com.zasiadko.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
public class User extends AbstractPersistable<UUID> {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

}
