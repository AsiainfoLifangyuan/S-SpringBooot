package boot;


import boot.mapper.PopSprSectionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisATest {


    @Autowired
    private PopSprSectionMapper mapper;

    @Test
    public void getSectionAll(){
        List<Map<String,Object>> list = mapper.getAllSection();
        System.out.println("结果为"+list);
    }
}
