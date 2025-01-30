@RestController
@RequestMapping("/api/greedy")
public class exercicio2 {

    @GetMapping("/change")
    public Map<String, Object> getChange(
            @RequestParam int amount,
            @RequestParam List<Integer> coins) {
        coins.sort(Collections.reverseOrder()); // Ordena as moedas em ordem decrescente
        Map<String, Object> result = new HashMap<>();
        List<Integer> usedCoins = new ArrayList<>();
        int totalCoins = 0;

        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                usedCoins.add(coin);
                totalCoins++;
            }
        }

        result.put("usedCoins", usedCoins);
        result.put("totalCoins", totalCoins);
        return result;
    }
}
