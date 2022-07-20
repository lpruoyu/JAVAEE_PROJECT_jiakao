package programmer.lp.jk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import programmer.lp.jk.enhance.MPPage;
import programmer.lp.jk.enhance.MPQueryWrapper;
import programmer.lp.jk.mapper.ExamPlaceCourseMapper;
import programmer.lp.jk.pojo.po.ExamPlaceCourse;
import programmer.lp.jk.pojo.vo.req.page.ReqPageExamPlaceCourse;
import programmer.lp.jk.pojo.vo.resp.RespExamPlaceCourse;
import programmer.lp.jk.pojo.vo.resp.json.JSONPageResult;
import programmer.lp.jk.service.ExamPlaceCourseService;

@Transactional
@Service
public class ExamPlaceCourseServiceImpl extends ServiceImpl<ExamPlaceCourseMapper, ExamPlaceCourse> implements ExamPlaceCourseService {
    @Override
    public JSONPageResult<RespExamPlaceCourse> list(ReqPageExamPlaceCourse reqPage) {
        final MPQueryWrapper<RespExamPlaceCourse> wrapper = new MPQueryWrapper<>();
        final Short type = reqPage.getType();
        final Integer cityId = reqPage.getCityId();
        final Integer provinceId = reqPage.getProvinceId();
        final Integer placeId = reqPage.getPlaceId();
        wrapper.like(reqPage.getKeyword(), "c.name", "intro");
        if (type != null) {
            wrapper.eq("type", type);
        }
        if (placeId != null && placeId > 0) {
            wrapper.eq("place_id", placeId);
        } else if (cityId != null && cityId > 0) {
            wrapper.eq("city_id", cityId);
        } else if (provinceId != null && provinceId > 0) {
            wrapper.eq("province_id", provinceId);
        }
        return baseMapper.selectPageResp(new MPPage<>(reqPage), wrapper)
                .buildResult();
    }

//    @Override
//    public JSONPageResult<RespExamPlaceCourse> list(ReqPageExamPlaceCourse reqPage) {
//        final MPQueryWrapper<RespExamPlaceCourse> wrapper = new MPQueryWrapper<>();
//        final Short type = reqPage.getType();
//        final Integer cityId = reqPage.getCityId();
//        final Integer provinceId = reqPage.getProvinceId();
//        final Integer placeId = reqPage.getPlaceId();
//        wrapper.like(reqPage.getKeyword(), RespExamPlaceCourse::getName, RespExamPlaceCourse::getIntro);
//        if (type != null) {
//            wrapper.eq(RespExamPlaceCourse::getType, type);
//        }
//        if (placeId != null && placeId > 0) {
//            wrapper.eq(RespExamPlaceCourse::getPlaceId, placeId);
//        } else if (cityId != null && cityId > 0) {
//            wrapper.eq(RespExamPlaceCourse::getCityId, cityId);
//        } else if (provinceId != null && provinceId > 0) {
//            wrapper.eq(RespExamPlaceCourse::getProvinceId, provinceId);
//        }
//        return baseMapper.selectPageResp(new MPPage<>(reqPage), wrapper)
//                .buildResult();
//    }
}