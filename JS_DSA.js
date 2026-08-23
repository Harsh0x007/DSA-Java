function containDup(nums) {
    const set = new Set();

    for(let i = 0; i < nums.length; i++) {
        if(set.has(nums[i])) {
            return true;
        }
        set.add(nums[i]);
    }
    return false;
}


// 169. Majortiy Element

function majorityElement(nums) {
    const map = new Map();
    for(let i = 0; i< nums.length; i++ ) {
        if(map.has(nums[i])) {
            map.set(nums[i], map.get(nums[i]) + 1);
        } else {
            map.set(nums[i], 1);
        }
    }
    for(const [key, value] of map) {
        if(value > nums.length/2) {
            return key;
        }
    }
}

// 53. Maximum Subarray Sum
function maxSubArr(nums) {
    let start = 0;
    let end = 0;
    let tempStart = 0
    let currSum= nums[0];
    let maxSum = nums[0];
    for(let i = 1; i < nums.length; i++) {
        if(nums[i] > currSum + nums[i]) {
            currSum = nums[i];
            tempStart = i;
        } else {
            currSum += nums[i];
        }

        if(currSum > maxSum) {
            maxSum = currSum;
            start = tempStart;
            end = i
        }
    }
    
    for(let i = start; i< end; i++) {
        console.log(`${nums[i]}`)
    }
    return `Sum: ${maxSum}`;
}

// 238 Product of Array except Self

function prodArrayRemvSelf(nums) {
    let prodRight = 1;
    let prodLeft = 1;
    let result = [];

    for(let i = 0; i< nums.length; i++) {
        result[i] = prodLeft;
        prodLeft = prodLeft * nums[i];
    }
    for(let i = nums.length - 1; i>=0; i--) {
        result[i] = result[i] * prodRight;
        prodRight = prodRight * nums[i];
    }
    return result;
}
console.log(prodArrayRemvSelf([1, 2, 0, 4]));