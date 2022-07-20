package programmer.lp.jk.mapstruct;

import javax.annotation.Generated;
import programmer.lp.jk.pojo.po.DictItem;
import programmer.lp.jk.pojo.po.DictType;
import programmer.lp.jk.pojo.po.ExamPlace;
import programmer.lp.jk.pojo.po.ExamPlaceCourse;
import programmer.lp.jk.pojo.po.PlateRegion;
import programmer.lp.jk.pojo.vo.req.save.ReqSaveDictItem;
import programmer.lp.jk.pojo.vo.req.save.ReqSaveDictType;
import programmer.lp.jk.pojo.vo.req.save.ReqSaveExamPlace;
import programmer.lp.jk.pojo.vo.req.save.ReqSaveExamPlaceCourse;
import programmer.lp.jk.pojo.vo.req.save.ReqSavePlateRegion;
import programmer.lp.jk.pojo.vo.resp.RespDictItem;
import programmer.lp.jk.pojo.vo.resp.RespDictType;
import programmer.lp.jk.pojo.vo.resp.RespExamPlace;
import programmer.lp.jk.pojo.vo.resp.RespExamPlaceCourse;
import programmer.lp.jk.pojo.vo.resp.RespPlateRegion;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-17T14:29:44+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class MapStructImpl implements MapStruct {

    @Override
    public DictItem vo2po(ReqSaveDictItem reqSaveVo) {
        if ( reqSaveVo == null ) {
            return null;
        }

        DictItem dictItem = new DictItem();

        dictItem.setId( reqSaveVo.getId() );
        dictItem.setName( reqSaveVo.getName() );
        dictItem.setValue( reqSaveVo.getValue() );
        dictItem.setTypeId( reqSaveVo.getTypeId() );
        dictItem.setSn( reqSaveVo.getSn() );
        dictItem.setDisabled( reqSaveVo.getDisabled() );

        return dictItem;
    }

    @Override
    public DictType vo2po(ReqSaveDictType reqSaveVo) {
        if ( reqSaveVo == null ) {
            return null;
        }

        DictType dictType = new DictType();

        dictType.setId( reqSaveVo.getId() );
        dictType.setName( reqSaveVo.getName() );
        dictType.setValue( reqSaveVo.getValue() );
        dictType.setIntro( reqSaveVo.getIntro() );

        return dictType;
    }

    @Override
    public ExamPlace vo2po(ReqSaveExamPlace reqSaveVo) {
        if ( reqSaveVo == null ) {
            return null;
        }

        ExamPlace examPlace = new ExamPlace();

        examPlace.setId( reqSaveVo.getId() );
        examPlace.setName( reqSaveVo.getName() );
        examPlace.setProvinceId( reqSaveVo.getProvinceId() );
        examPlace.setCityId( reqSaveVo.getCityId() );
        examPlace.setAddress( reqSaveVo.getAddress() );
        examPlace.setLatitude( reqSaveVo.getLatitude() );
        examPlace.setLongitude( reqSaveVo.getLongitude() );

        return examPlace;
    }

    @Override
    public ExamPlaceCourse vo2po(ReqSaveExamPlaceCourse reqSaveVo) {
        if ( reqSaveVo == null ) {
            return null;
        }

        ExamPlaceCourse examPlaceCourse = new ExamPlaceCourse();

        examPlaceCourse.setId( reqSaveVo.getId() );
        examPlaceCourse.setName( reqSaveVo.getName() );
        examPlaceCourse.setPrice( reqSaveVo.getPrice() );
        examPlaceCourse.setType( reqSaveVo.getType() );
        examPlaceCourse.setIntro( reqSaveVo.getIntro() );
        examPlaceCourse.setVideo( reqSaveVo.getVideo() );
        examPlaceCourse.setCover( reqSaveVo.getCover() );
        examPlaceCourse.setPlaceId( reqSaveVo.getPlaceId() );

        return examPlaceCourse;
    }

    @Override
    public PlateRegion vo2po(ReqSavePlateRegion reqSaveVo) {
        if ( reqSaveVo == null ) {
            return null;
        }

        PlateRegion plateRegion = new PlateRegion();

        plateRegion.setId( reqSaveVo.getId() );
        plateRegion.setName( reqSaveVo.getName() );
        plateRegion.setPlate( reqSaveVo.getPlate() );
        plateRegion.setParentId( reqSaveVo.getParentId() );

        return plateRegion;
    }

    @Override
    public RespDictItem po2vo(DictItem po) {
        if ( po == null ) {
            return null;
        }

        RespDictItem respDictItem = new RespDictItem();

        respDictItem.setId( po.getId() );
        respDictItem.setName( po.getName() );
        respDictItem.setValue( po.getValue() );
        respDictItem.setTypeId( po.getTypeId() );
        respDictItem.setSn( po.getSn() );
        respDictItem.setDisabled( po.getDisabled() );

        return respDictItem;
    }

    @Override
    public RespDictType po2vo(DictType po) {
        if ( po == null ) {
            return null;
        }

        RespDictType respDictType = new RespDictType();

        respDictType.setId( po.getId() );
        respDictType.setName( po.getName() );
        respDictType.setValue( po.getValue() );
        respDictType.setIntro( po.getIntro() );

        return respDictType;
    }

    @Override
    public RespExamPlace po2vo(ExamPlace po) {
        if ( po == null ) {
            return null;
        }

        RespExamPlace respExamPlace = new RespExamPlace();

        respExamPlace.setId( po.getId() );
        respExamPlace.setName( po.getName() );
        respExamPlace.setProvinceId( po.getProvinceId() );
        respExamPlace.setCityId( po.getCityId() );
        respExamPlace.setAddress( po.getAddress() );
        respExamPlace.setLatitude( po.getLatitude() );
        respExamPlace.setLongitude( po.getLongitude() );

        return respExamPlace;
    }

    @Override
    public RespExamPlaceCourse po2vo(ExamPlaceCourse po) {
        if ( po == null ) {
            return null;
        }

        RespExamPlaceCourse respExamPlaceCourse = new RespExamPlaceCourse();

        respExamPlaceCourse.setId( po.getId() );
        respExamPlaceCourse.setCreateTime( po.getCreateTime() );
        respExamPlaceCourse.setName( po.getName() );
        respExamPlaceCourse.setPrice( po.getPrice() );
        respExamPlaceCourse.setPlaceId( po.getPlaceId() );
        respExamPlaceCourse.setType( po.getType() );
        respExamPlaceCourse.setIntro( po.getIntro() );
        respExamPlaceCourse.setVideo( po.getVideo() );
        respExamPlaceCourse.setCover( po.getCover() );

        return respExamPlaceCourse;
    }

    @Override
    public RespPlateRegion po2vo(PlateRegion po) {
        if ( po == null ) {
            return null;
        }

        RespPlateRegion respPlateRegion = new RespPlateRegion();

        respPlateRegion.setId( po.getId() );
        respPlateRegion.setName( po.getName() );
        respPlateRegion.setPlate( po.getPlate() );
        respPlateRegion.setParentId( po.getParentId() );

        return respPlateRegion;
    }
}
