package hap.fruit.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hap.fruit.dto.Fruit;

import java.util.List;

public interface IFruitService extends IBaseService<Fruit>, ProxySelf<IFruitService>{
    int updateList(List<Fruit> fruitList);
}