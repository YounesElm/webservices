package com.example.restserverreact;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Tello;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class TelloRepository {
    private static final Map<String, Tello> tellos = new HashMap<>();

    @PostConstruct
    public void initData() {
        Tello ibis = new Tello();
        ibis.setName("Ibis");
        ibis.setStars(2);
        ibis.setCurrency(Currency.EUR);
        ibis.setPrice(10);

        tellos.put(ibis.getName(), ibis);

        Tello kyriad = new Tello();
        kyriad.setName("Kyriad");
        kyriad.setStars(3);
        kyriad.setCurrency(Currency.EUR);
        kyriad.setPrice(50);

        tellos.put(kyriad.getName(), kyriad);

        Tello burj = new Tello();
        burj.setName("Burj Khalifa");
        burj.setStars(5);
        burj.setCurrency(Currency.EUR);
        burj.setPrice(300);

        tellos.put(burj.getName(), burj);
    }

    public Tello findTello(String name) {
        Assert.notNull(name, "The tello name must not be null");
        return tellos.get(name);
    }

}
