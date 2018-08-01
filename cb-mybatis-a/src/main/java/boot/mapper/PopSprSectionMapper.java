package boot.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PopSprSectionMapper {

    List<Map<String,Object>> getAllSection();

}
