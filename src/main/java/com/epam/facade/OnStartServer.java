package com.epam.facade;

import com.epam.model.onetomany.Cart;
import com.epam.model.onetomany.Item;
import com.epam.model.onetoone.Address;
import com.epam.model.onetoone.User;
import com.epam.repository.CartRepository;
import com.epam.repository.ItemRepository;
import com.epam.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class OnStartServer implements ApplicationListener<ApplicationReadyEvent> {

    Logger logger = LoggerFactory.getLogger(OnStartServer.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("CRM started...");

        // one-to-one
        // https://www.baeldung.com/jpa-one-to-one
        User t1 = new User();
        t1.setName("John Dow");

        Address a1 = new Address();
        a1.setStreet("123 Main Street");
        a1.setCity("New York");
        t1.setAddress(a1);

        userRepository.save(t1);


        // one-to-many
        // https://www.baeldung.com/hibernate-one-to-many
        // https://medium.com/@mohamedyousife3/one-to-many-mapping-in-spring-jpa-117d7717929b
        Item item1 = new Item();
        item1.setName("item 1");
        Item item2 = new Item();
        item2.setName("item 2");

        Set<Item> items = new HashSet<>();
        items.add(item1);
        items.add(item2);

        Cart cart = new Cart();
        cart.setName("cart-1");
        cart.setItems(items);
        cartRepository.save(cart);






        System.out.println("---");
    }
}
