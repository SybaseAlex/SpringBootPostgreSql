
package com.amtoss.service;

import java.util.Set;

/**
 *
 * @author Alex
 */
public interface DataService {

    public boolean persist(String problem);

    public Set<String> getRandomData();
}
