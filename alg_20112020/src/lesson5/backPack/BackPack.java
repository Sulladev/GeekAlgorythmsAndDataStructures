package lesson5.backPack;

public class BackPack {
    private Item[] items;

    BackPack(Item[] items) {
        this.items = items;
    }

    int findBestSum(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > weight) {
            return findBestSum(i - 1, weight);
        } else {
            return Math.max(findBestSum(i - 1, weight),
                    findBestSum(i - 1, weight - items[i].weight) + items[i].price);
        }
    }
}
