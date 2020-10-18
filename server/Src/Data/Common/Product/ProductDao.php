<?php
/*
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

namespace App\Data\Common\Product;

use App\Domain\Model\Product\IdProductAttributes;
use App\Domain\Model\Product\Product;

/**
 * Defines the Product DAO.
 *
 * @package App\Database\Relation\Product
 */
interface ProductDao {

    public function create(Product $product): Product;

    public function fetch(IdProductAttributes $id): ?Product;

    public function update(Product $product): void;

    public function delete(Product $product): void;

}