import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    // Add more tests here!
    // Come up with varied cases


    @Test
    public void testOnlyStartReachable() {
        int[][] island = {
            {2,2,2},
            {2,0,2},
            {2,2,2},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testFullyOpenIsland() {
        int[][] island = {
            {0,1,1},
            {1,1,1},
            {1,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(9, actual);
    }

    @Test
    public void testBlockedStart() {
        int[][] island = {
            {2,2,2},
            {2,0,2},
            {2,3,2},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testCornerStart() {
        int[][] island = {
            {0,1},
            {1,1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(4, actual);
    }



    @Test
    public void testSurroundedByWalls() {
        int[][] island = {
            {1,3,1},
            {3,0,3},
            {1,3,1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testAllMountains() {
        int[][] island = {
            {3,3,3},
            {3,0,3},
            {3,3,3}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testAllFields() {
        int[][] island = {
            {0,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(12, actual);
    }

    @Test
public void testExplorerOnEdge() {
    int[][] island = {
        {0,1,2},
        {3,1,2},
        {2,1,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(5, actual); 
}


    @Test
    public void testDisconnectedLand() {
        int[][] island = {
            {0,2,1},
            {2,2,2},
            {1,1,1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testMultiplePathsSameResult() {
        int[][] island = {
            {0,1,1},
            {1,1,1},
            {1,1,1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(9, actual);
    }

    @Test
public void testSurroundedByWater() {
    int[][] island = {
        {2,2,2},
        {2,0,2},
        {2,2,2}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(1, actual);
}

@Test
public void testWindingPath() {
    int[][] island = {
        {0,2,2,2},
        {1,1,1,2},
        {2,2,1,2},
        {2,2,1,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(7, actual);
}

@Test
public void testNoMoveOnlyMountains() {
    int[][] island = {
        {3,3,3},
        {3,0,3},
        {3,3,3}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(1, actual);
}
@Test
public void testPlusShape() {
    int[][] island = {
        {2,1,2},
        {1,0,1},
        {2,1,2}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(5, actual);
}
@Test
public void testHorizontalCorridor() {
    int[][] island = {
        {0,1,1,1,1,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(6, actual);
}

@Test
public void testBottomCornerStart() {
    int[][] island = {
        {1,1,1},
        {1,1,1},
        {1,1,0}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(9, actual);
}

@Test
public void testMixedUnreachableFields() {
    int[][] island = {
        {0,1,1,2},
        {2,3,1,3},
        {1,1,1,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(8, actual);
}

@Test
public void testOneTileIsland() {
    int[][] island = {
        {0}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(1, actual);
}
@Test
public void testDiagonalBlockNoAccess() {
    int[][] island = {
        {1,2,1},
        {2,0,2},
        {1,2,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(1, actual);
}
@Test
public void testOneWayOut() {
    int[][] island = {
        {3,3,3,3},
        {3,0,1,3},
        {3,3,3,3}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(2, actual); 
}

@Test
public void testLoopPath() {
    int[][] island = {
        {0,1,1},
        {1,3,1},
        {1,1,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(8, actual); 
}
@Test
public void testTrappedNextToField() {
    int[][] island = {
        {0,3},
        {3,1}
    };
    int actual = ExplorerSearch.reachableArea(island);
    assertEquals(1, actual);
}

}
