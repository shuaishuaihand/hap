package hap.fruit.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hap.fruit.dto.Fruit;

public interface FruitMapper extends Mapper<Fruit>{
    int myUpdate(Fruit fruit);
}