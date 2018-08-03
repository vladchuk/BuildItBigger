package net.javango.builditbigger;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import net.javango.builditbigger.MyBean;
import net.javango.jokelib.JokeTeller;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.javango.net",
                ownerName = "backend.builditbigger.javango.net",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hello, " + name);

        return response;
    }

    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke() {
        MyBean response = new MyBean();
        JokeTeller teller = new JokeTeller();
        String joke = teller.tellJoke();
        response.setData(joke);

        return response;
    }

}
