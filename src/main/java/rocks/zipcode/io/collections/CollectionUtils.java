package rocks.zipcode.io.collections;

import java.util.*;
import java.util.stream.Stream;

public class CollectionUtils {
    
    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {
        return new ArrayList<>(collection);
    }
    
    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        return Objects.equals(nestedCollection, collection);
    }
    
    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {
        return new ArrayList<>(Arrays.asList(collections));
    }
    
    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        ArrayList<Object> arrList = new ArrayList<>();
        for (Collection c : collections){
            arrList.addAll(c);
        }
        return arrList;
    }
    
    private static Stream<Object> flatten(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] ? flatten((Object[]) o) : Stream.of(o));
    }
}
