package rocks.zipcode.io.collections;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;
    
    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }
    
    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        List<TypeOfSet> list = new ArrayList<>(originalSet);
        int n = list.size();
        Set<Set<TypeOfSet>> powerSet = new HashSet<>();
        for (int i = 0; i < (1 << n); i++) {
            Set<TypeOfSet> element = new HashSet<>();
            for (int j = 0; j < n; j++)
                if ((i >> j) % 2 == 1) element.add(list.get(j));
            powerSet.add(element);
        }
        return powerSet;
    }
    
    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
