
package com.amtoss.repository;

import com.amtoss.entity.DomainObject;
import java.util.Set;

/**
 *
 * @author Alex
 * @param <V>
 */
public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();

}
