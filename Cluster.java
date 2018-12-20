package GenericCluster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cluster<T extends Point2D> {
    public Map<Long, T> elements;

    public Cluster() {
        elements = new HashMap<>();
    }

    public void addItem(T element) {
        elements.put(element.getId(), element);
    }

    public void near(long id, int top) {
        T currentPoint = elements.get(id);

        List<TwoPoints> points = elements.values()
                                         .stream()
                                         .filter(element -> element.getId() != id)
                                         .map(element -> new TwoPoints(currentPoint, element))
                                         .sorted(Comparator.comparing(TwoPoints::getDistance))
                                         .limit(top)
                                         .collect(Collectors.toList());

        IntStream.range(0 , points.size())
                    .mapToObj(index -> String.format("%d. %s", index+1, points.get(index)))
                    .forEach(System.out::println);

    }
}
