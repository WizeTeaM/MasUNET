package Controllers;

import Entities.Notificacion;
import Facades.NotificacionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "notificacionController")
@SessionScoped
public class NotificacionController extends AbstractController<Notificacion> implements Serializable {

    @Inject
    private NotificacionFacade ejbFacade;

    public NotificacionController() {
        super(Notificacion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
