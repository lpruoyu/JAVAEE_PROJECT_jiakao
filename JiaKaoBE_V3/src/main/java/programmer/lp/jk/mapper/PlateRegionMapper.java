package programmer.lp.jk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import programmer.lp.jk.pojo.vo.resp.RespProvince;
import programmer.lp.jk.pojo.po.PlateRegion;

import java.util.List;

public interface PlateRegionMapper extends BaseMapper<PlateRegion> {
    List<RespProvince> selectRegions();
}
