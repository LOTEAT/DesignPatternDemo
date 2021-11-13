package converter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 转换器的顶层接口
 */
public class Converter<D, E>
{
    /**
     * 在编写代码时我发现很多基类实现都有dto和entity两个概念
     * 对此，我的理解是
     * dto是展示对象或者说是表示层
     * entity则是实体对象
     * 如果以门票和游客的转换器为例，那么门票就是dto类型，也就是游客信息的展示
     * 而entity则是游客，也就是说是一个实体。
     */

    // 从 D 转换为 E
    private Function<D, E> toEntity;
    // 从 E 转换为 D
    private Function<E, D> toDto;

    /**
     * 构造函数
     * @param toEntity 从T到U的转换函数 也即从dto到entity的转换函数
     * @param toDto    从U到T的转换函数 也即从entity到dto的转换函数
     */
    public Converter(final Function<D, E> toEntity, final Function<E, D> toDto)
    {
        this.toEntity = toEntity;
        this.toDto = toDto;
    }

    /**
     * D->E的转换
     *
     * @param dto T对象
     * @return 把T对象转换成U对象
     */
    public final E dto2entity(final D dto)
    {
        return toEntity.apply(dto);
    }

    /**
     * E->D的转换
     *
     * @param entity E对象
     * @return 把E对象转换成D对象
     */
    public final D entity2dto(final E entity)
    {
        return toDto.apply(entity);
    }

    /**
     * D->E的批处理转换
     *
     * @param dtos D对象列表
     * @return 把D对象列表转换成E对象列表
     */
    public final List<E> dtos2entities(final List<D> dtos)
    {
        return dtos.stream().map(this::dto2entity).collect(Collectors.toList());
    }

    /**
     * E->D的批处理转换
     *
     * @param entities E对象列表
     * @return 把E对象列表转换成D对象列表
     */
    public final List<D> entities2dtos(final List<E> entities)
    {
        return entities.stream().map(this::entity2dto).collect(Collectors.toList());
    }
}