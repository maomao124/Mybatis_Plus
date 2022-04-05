package mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import data.Student;

import java.util.List;

/**
 * Project name(项目名称)：Mybatis_Plus
 * Package(包名): mapper
 * Interface(接口名): StudentMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/5
 * Time(创建时间)： 21:08
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface StudentMapper extends BaseMapper<Student>
{
    List<Student> findAll();
}
