package com.dang;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class DangCode {
    public static void main(String[] args) {

        AutoGenerator autoGenerator=new AutoGenerator();

        //设置全局配置
        GlobalConfig global=new GlobalConfig();
        String path = System.getProperty("user.dir");
        global.setOutputDir(path+"/src/main/java");
        global.setAuthor("dang");
        global.setFileOverride(false);
        global.setOpen(false);
        global.setServiceName("%sService");//去除service的前缀
        global.setIdType(IdType.ID_WORKER);
        global.setDateType(DateType.ONLY_DATE);
        global.setSwagger2(true);
        autoGenerator.setGlobalConfig(global);


        //配置数据源
        DataSourceConfig datasource=new DataSourceConfig();
        datasource.setDriverName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/course?useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        datasource.setUsername("root");
        datasource.setPassword("");
        datasource.setDbType(DbType.MYSQL);
        autoGenerator.setDataSource(datasource);

        //设置包
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setModuleName("test");
        packageConfig.setParent("com.dang");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);

        //设置策略
        StrategyConfig strategy=new StrategyConfig();
        strategy.setInclude("exam"); //设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        //设置逻辑删除
        strategy.setLogicDeleteFieldName("deleted");
        //设置自动填充
        List<TableFill> lists=new ArrayList<>();
        TableFill create=new TableFill("create_time", FieldFill.INSERT);
        TableFill update=new TableFill("update_time",FieldFill.INSERT_UPDATE);
        lists.add(create);
        lists.add(update);
        strategy.setTableFillList(lists);
        //设置乐观锁
        strategy.setVersionFieldName("version");
        //支持restful风格
        strategy.setRestControllerStyle(true);
        //url中可以使用下划线    localhost:8080/hello_id_2
        strategy.setControllerMappingHyphenStyle(true);

        autoGenerator.setStrategy(strategy);

        autoGenerator.execute();
    }
}
