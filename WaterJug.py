def canMeasureWater( jug1, jug2, target):
        if jug1 + jug2 < target:
            return False
        if jug1 + jug2 == target:
            return True

        limit = jug1 + jug2
        queue = [0]
        visited = set()
        while queue:
            curr = queue.pop(0)
            visited.add(curr)
            if curr == target:
                return True

            for diff in [jug1, -jug1, jug2, -jug2]:
                new = curr + diff
                if 0 <= new <= limit and new not in visited:
                    queue.append(new)
        print("sjhfgbdsyf")
        print("shkfgs")
        

canMeasureWater(3,5,1)
