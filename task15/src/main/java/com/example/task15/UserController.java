package com.example.task15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
//curl -i -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"Peter\",\"lastName\":\"Andreevich\"}" http://localhost:5432/users

@RestController
@RequestMapping(value="/users")
public class UserController {
    final
    userWork user;

    public UserController(@Qualifier("userWork") userWork user) {
        this.user = user;
    }

    @GetMapping(value="")
    public ResponseEntity<List<User>> getFull() {
        final List<User> usrs = user.getUsers();
        return usrs != null ? new ResponseEntity<>(usrs, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<User> read(@PathVariable(name="id") long id) {
        final User user1 = user.read(id);
        return user1 != null
                ? new ResponseEntity<>(user1, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="")
    public ResponseEntity<?> addUser(@RequestBody User us){
        user.saveUser(us);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable(name="id") long id) {
        final boolean deleted = user.deleteUser(user.read(id));
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

