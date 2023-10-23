import { useState } from "react";
import Board from "./Board";

function TicTacToe() {
    const [tiles, setTiles] = useState(Array(10).fill(null))
    return(
        <div>
            <h1>Tic Tac Toe</h1>
            <Board tiles={tiles}/>
        </div>
    );
}

export default TicTacToe;