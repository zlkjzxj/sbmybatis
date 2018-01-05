# spring boot +mybatis配置文件方式

注解方式很简单，官网有，一看就会。


#1.spring boot 配置
    在application添加@MapperScan("com.walle.sbmybatis.dao")
  这个扫描的是dao接口，接口里面方法的名字对应mapper里面id的名字
  而且namespace以dao接口的包命名
  
  在application.yml里面配置数据库连接和mybatis配置文件路径
    
  
#2.mybatis配置
   直接在resource下创建mapper文件夹，把mapper文件都放在下面
   
   也可以添加mybatis主配置文件 放在resource下面，如果属性都默认的话也不用添加
   
   假如要使用typeAliase 就需要把mapper也写到下面：如下
   
        <typeAliases>
           <typeAlias type="girl" alias="com.walle.sbmybatis.bean.Girl"/>
        </typeAliases>
   
       <mappers>
           <mapper resource="mapper/Girl.xml"/>
       </mappers>
  
    
