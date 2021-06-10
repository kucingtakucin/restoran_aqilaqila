package com.example.servingwebcontent.Controllers.User;

import java.util.Optional;

import com.example.servingwebcontent.Models.Menu;
import com.example.servingwebcontent.Repositories.MenuRepository;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {
    
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/menu")
    public String index() {
		return "User/Menu/menu";	
    }

    @GetMapping("/menu/data")
    public @ResponseBody Iterable<Menu> data() {
        // This returns a JSON or XML with the users
        return menuRepository.findAll();
    }

    @PostMapping("/menu") // Map ONLY POST Requests
    public @ResponseBody Menu insert (
		@RequestBody @Validated Menu menu
	) {
      	// @ResponseBody means the returned String is the response, not a view name
      	// @RequestParam means it is a parameter from the GET or POST request
		return menuRepository.save(menu);
    }

	@GetMapping("/menu/{id}")
	public @ResponseBody Optional<Menu> show (
		@PathVariable("id") Integer id
	) {
		return menuRepository.findById(id);
	}

	@PutMapping("/menu/{id}")
	public @ResponseBody ResponseEntity<Menu> update (
		@PathVariable("id") Integer id,
		@RequestBody @Validated Menu menu
	) {
		return menuRepository.findById(id)
			.map(obj -> {
				obj.setId(id);
				return ResponseEntity.ok(menuRepository.save(menu));
			}).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/menu/{id}")
	public @ResponseBody ResponseEntity<Menu> delete (
		@PathVariable("id") Integer id,
		@RequestBody @Validated Menu menu
	) {
		return menuRepository.findById(id)
			.map(obj -> {
				menuRepository.deleteById(id);
				return ResponseEntity.ok(obj);
			}).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
