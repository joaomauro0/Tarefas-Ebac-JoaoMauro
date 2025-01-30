@RestController
@RequestMapping("/api/backtracking")
public class exercicio1 {

    @GetMapping("/subsets")
    public List<List<Integer>> generateSubsets(
            @RequestParam List<Integer> set,
            @RequestParam int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), set, n, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, List<Integer> set, int n, int start) {
        if (tempList.size() == n) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < set.size(); i++) {
            tempList.add(set.get(i));
            backtrack(result, tempList, set, n, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
