package br.com.bledson.ecommerce.publication.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("publications")
@RestController
public class PublicationController {

    @PostMapping()
    void saveImages(@RequestBody String productName) {
        System.out.println("new publication at marketplace demo for product: " + productName);
    }
}
