package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*540/Math.cos(temp*Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
